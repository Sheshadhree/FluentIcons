package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pulse32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pulse32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.53f, 5f)
            curveToRelative(0.548f, 0.013f, 1.024f, 0.383f, 1.173f, 0.91f)
            lineToRelative(4.354f, 15.438f)
            lineToRelative(3.25f, -10.468f)
            curveToRelative(0.153f, -0.496f, 0.597f, -0.845f, 1.115f, -0.878f)
            curveToRelative(0.517f, -0.032f, 1.001f, 0.258f, 1.216f, 0.73f)
            lineToRelative(2.167f, 4.768f)
            horizontalLineToRelative(2.945f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(28.44f, 18f, 27.75f, 18f)
            horizontalLineTo(24f)
            curveToRelative(-0.49f, 0f, -0.935f, -0.287f, -1.138f, -0.733f)
            lineToRelative(-1.141f, -2.51f)
            lineToRelative(-3.527f, 11.364f)
            curveToRelative(-0.164f, 0.528f, -0.657f, 0.886f, -1.21f, 0.879f)
            curveToRelative(-0.554f, -0.007f, -1.037f, -0.378f, -1.187f, -0.91f)
            lineTo(11.4f, 10.501f)
            lineToRelative(-2.214f, 6.643f)
            curveTo(9.016f, 17.655f, 8.538f, 18f, 8f, 18f)
            horizontalLineTo(4.25f)
            curveTo(3.56f, 18f, 3f, 17.44f, 3f, 16.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineTo(7.1f)
            lineToRelative(3.214f, -9.645f)
            curveTo(10.488f, 5.335f, 10.981f, 4.987f, 11.53f, 5f)
            close()
        }
    }.build()
}
