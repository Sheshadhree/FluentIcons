package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeOrganic20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeOrganic20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.507f, 7.83f)
            curveToRelative(0.41f, 0.316f, 0.883f, 0.328f, 1.339f, 0.528f)
            curveToRelative(0.25f, 0.11f, 0.576f, 0.296f, 0.9f, 0.605f)
            curveToRelative(0.661f, 0.631f, 1.255f, 1.718f, 1.255f, 3.537f)
            curveToRelative(0f, 2.062f, -1.012f, 3.47f, -2.537f, 4.332f)
            curveTo(13.97f, 17.677f, 11.997f, 18f, 10f, 18f)
            curveToRelative(-2.191f, 0f, -4.212f, -0.378f, -5.684f, -1.617f)
            curveToRelative(-1.908f, -1.605f, -2.345f, -4.348f, -2.32f, -6.71f)
            curveToRelative(0.007f, -0.65f, 0.089f, -2.112f, 0.676f, -3.606f)
            curveToRelative(0.392f, -0.995f, 1.016f, -2.017f, 2.01f, -2.79f)
            curveToRelative(1.177f, -0.914f, 2.705f, -1.3f, 4.178f, -1.276f)
            curveToRelative(0.248f, 0.006f, 1.231f, 0.045f, 2.255f, 0.402f)
            curveTo(12.269f, 2.805f, 13.6f, 3.68f, 13.6f, 5.5f)
            curveToRelative(0f, 1.36f, 0.49f, 2.007f, 0.906f, 2.33f)
            close()
        }
    }.build()
}
