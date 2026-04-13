package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorBackgroundAccent20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorBackgroundAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 11.415f)
            lineToRelative(0.328f, 0.328f)
            curveToRelative(1.172f, 1.171f, 3.071f, 1.171f, 4.243f, 0f)
            lineTo(8f, 11.063f)
            curveTo(8.028f, 12.404f, 8.96f, 14f, 10.75f, 14f)
            curveToRelative(1.816f, 0f, 2.75f, -1.646f, 2.75f, -3f)
            curveToRelative(0f, -1.014f, -0.532f, -1.956f, -0.862f, -2.472f)
            curveToRelative(-0.19f, -0.295f, -0.377f, -0.546f, -0.516f, -0.722f)
            lineToRelative(-0.007f, -0.009f)
            lineToRelative(-0.234f, -0.282f)
            lineTo(11.869f, 7.5f)
            curveToRelative(-0.224f, -0.25f, -0.524f, -0.417f, -0.85f, -0.477f)
            curveToRelative(0.062f, -0.809f, -0.203f, -1.638f, -0.794f, -2.274f)
            horizontalLineTo(15.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-2.085f)
            close()
        }
    }.build()
}
