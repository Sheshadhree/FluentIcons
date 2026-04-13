package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Teddy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Teddy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(3.567f, 3f, 2f, 4.567f, 2f, 6.5f)
            curveToRelative(0f, 0.756f, 0.24f, 1.456f, 0.647f, 2.028f)
            curveToRelative(0.999f, -2.171f, 3.055f, -3.775f, 5.496f, -4.323f)
            curveTo(7.5f, 3.467f, 6.555f, 3f, 5.5f, 3f)
            close()
            moveToRelative(12.498f, 3.5f)
            curveToRelative(0f, 0.756f, -0.24f, 1.455f, -0.646f, 2.027f)
            curveToRelative(-0.998f, -2.171f, -3.055f, -3.774f, -5.496f, -4.322f)
            curveTo(12.497f, 3.467f, 13.443f, 3f, 14.499f, 3f)
            curveToRelative(1.932f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 7.873f, 6.172f, 5f, 10f, 5f)
            reflectiveCurveToRelative(7f, 2.873f, 7f, 6.5f)
            curveToRelative(0f, 1.665f, -0.669f, 3.172f, -1.763f, 4.314f)
            curveTo(14.525f, 13.601f, 12.45f, 12f, 10f, 12f)
            reflectiveCurveToRelative(-4.525f, 1.601f, -5.237f, 3.814f)
            curveTo(3.67f, 14.672f, 3f, 13.165f, 3f, 11.5f)
            close()
            moveToRelative(8.328f, 1.699f)
            curveToRelative(1.542f, 0.476f, 2.731f, 1.759f, 3.073f, 3.356f)
            curveTo(13.193f, 17.46f, 11.658f, 18f, 10f, 18f)
            reflectiveCurveToRelative(-3.193f, -0.54f, -4.4f, -1.445f)
            curveToRelative(0.34f, -1.597f, 1.53f, -2.88f, 3.072f, -3.356f)
            curveTo(8.925f, 13.675f, 9.425f, 14f, 10f, 14f)
            curveToRelative(0.576f, 0f, 1.076f, -0.325f, 1.328f, -0.801f)
            close()
        }
    }.build()
}
