package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 11.25f)
            curveTo(5f, 11.664f, 5.336f, 12f, 5.75f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(1.182f, 0f, 2.133f, -0.412f, 2.788f, -1.087f)
            curveTo(12.185f, 10.246f, 12.5f, 9.366f, 12.5f, 8.5f)
            curveToRelative(0f, -0.866f, -0.315f, -1.746f, -0.962f, -2.413f)
            curveTo(10.883f, 5.412f, 9.932f, 5f, 8.75f, 5f)
            horizontalLineTo(5.56f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(5.56f, 6.5f)
            horizontalLineToRelative(3.19f)
            curveToRelative(0.818f, 0f, 1.367f, 0.276f, 1.712f, 0.631f)
            curveTo(10.815f, 7.497f, 11f, 7.992f, 11f, 8.5f)
            curveToRelative(0f, 0.51f, -0.185f, 1.004f, -0.538f, 1.368f)
            curveTo(10.117f, 10.224f, 9.568f, 10.5f, 8.75f, 10.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.336f, 10.5f, 5f, 10.836f, 5f, 11.25f)
            close()
        }
    }.build()
}
