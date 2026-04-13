package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.75f)
            curveTo(5f, 4.336f, 5.336f, 4f, 5.75f, 4f)
            horizontalLineToRelative(3f)
            curveToRelative(1.182f, 0f, 2.133f, 0.412f, 2.788f, 1.087f)
            curveTo(12.185f, 5.754f, 12.5f, 6.634f, 12.5f, 7.5f)
            curveToRelative(0f, 0.866f, -0.315f, 1.746f, -0.962f, 2.413f)
            curveTo(10.883f, 10.588f, 9.932f, 11f, 8.75f, 11f)
            horizontalLineTo(5.56f)
            lineToRelative(0.72f, 0.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(5.56f, 9.5f)
            horizontalLineToRelative(3.19f)
            curveToRelative(0.818f, 0f, 1.367f, -0.276f, 1.712f, -0.632f)
            curveTo(10.815f, 8.504f, 11f, 8.01f, 11f, 7.5f)
            curveToRelative(0f, -0.51f, -0.185f, -1.004f, -0.538f, -1.369f)
            curveTo(10.117f, 5.777f, 9.568f, 5.5f, 8.75f, 5.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.336f, 5.5f, 5f, 5.164f, 5f, 4.75f)
            close()
        }
    }.build()
}
