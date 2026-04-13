package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.462f, 5.087f)
            curveTo(5.117f, 4.412f, 6.068f, 4f, 7.25f, 4f)
            horizontalLineToRelative(3f)
            curveTo(10.664f, 4f, 11f, 4.336f, 11f, 4.75f)
            reflectiveCurveTo(10.664f, 5.5f, 10.25f, 5.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.818f, 0f, -1.367f, 0.276f, -1.712f, 0.631f)
            curveTo(5.185f, 6.497f, 5f, 6.992f, 5f, 7.5f)
            curveToRelative(0f, 0.51f, 0.185f, 1.004f, 0.538f, 1.368f)
            curveTo(5.883f, 9.224f, 6.432f, 9.5f, 7.25f, 9.5f)
            horizontalLineToRelative(3.19f)
            lineTo(9.72f, 8.78f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(10.44f, 11f)
            horizontalLineTo(7.25f)
            curveToRelative(-1.182f, 0f, -2.133f, -0.412f, -2.788f, -1.087f)
            curveTo(3.815f, 9.246f, 3.5f, 8.366f, 3.5f, 7.5f)
            curveToRelative(0f, -0.866f, 0.315f, -1.746f, 0.962f, -2.413f)
            close()
        }
    }.build()
}
