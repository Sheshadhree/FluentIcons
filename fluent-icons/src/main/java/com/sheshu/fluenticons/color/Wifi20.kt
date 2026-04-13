package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Wifi20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Wifi20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.113636f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF)
                ),
                center = Offset(10f, 15f),
                radius = 11f
            )
        ) {
            moveTo(10f, 6f)
            curveTo(7.202f, 6f, 4.702f, 7.276f, 3.05f, 9.282f)
            curveTo(2.7f, 9.708f, 2.07f, 9.769f, 1.643f, 9.418f)
            curveTo(1.216f, 9.066f, 1.155f, 8.436f, 1.506f, 8.01f)
            curveTo(3.522f, 5.563f, 6.58f, 4f, 10f, 4f)
            curveToRelative(3.421f, 0f, 6.478f, 1.563f, 8.494f, 4.01f)
            curveToRelative(0.351f, 0.426f, 0.29f, 1.056f, -0.136f, 1.408f)
            curveToRelative(-0.426f, 0.35f, -1.056f, 0.29f, -1.407f, -0.136f)
            curveTo(15.298f, 7.276f, 12.799f, 6f, 10f, 6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.113636f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF)
                ),
                center = Offset(10f, 15f),
                radius = 11f
            )
        ) {
            moveTo(5.25f, 11.334f)
            curveTo(6.349f, 9.912f, 8.068f, 9f, 10f, 9f)
            reflectiveCurveToRelative(3.651f, 0.912f, 4.75f, 2.334f)
            curveToRelative(0.338f, 0.437f, 0.966f, 0.517f, 1.403f, 0.18f)
            curveToRelative(0.437f, -0.338f, 0.517f, -0.966f, 0.18f, -1.403f)
            curveTo(14.87f, 8.22f, 12.578f, 7f, 10f, 7f)
            curveToRelative(-2.578f, 0f, -4.871f, 1.22f, -6.333f, 3.11f)
            curveToRelative(-0.337f, 0.438f, -0.257f, 1.066f, 0.18f, 1.404f)
            curveToRelative(0.437f, 0.337f, 1.065f, 0.257f, 1.403f, -0.18f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.113636f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF)
                ),
                center = Offset(10f, 15f),
                radius = 11f
            )
        ) {
            moveTo(7.488f, 13.359f)
            curveTo(8.025f, 12.539f, 8.95f, 12f, 10f, 12f)
            reflectiveCurveToRelative(1.974f, 0.539f, 2.512f, 1.359f)
            curveToRelative(0.302f, 0.462f, 0.922f, 0.591f, 1.384f, 0.289f)
            curveToRelative(0.462f, -0.303f, 0.591f, -0.923f, 0.289f, -1.385f)
            curveTo(13.293f, 10.903f, 11.752f, 10f, 10f, 10f)
            curveToRelative(-1.753f, 0f, -3.294f, 0.902f, -4.185f, 2.263f)
            curveToRelative(-0.303f, 0.462f, -0.174f, 1.082f, 0.288f, 1.385f)
            curveToRelative(0.462f, 0.302f, 1.082f, 0.173f, 1.385f, -0.289f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.113636f to Color(0xFF8B52F4),
                    1f to Color(0xFFEA71EF)
                ),
                center = Offset(10f, 15f),
                radius = 11f
            )
        ) {
            moveTo(10f, 16.5f)
            curveToRelative(0.829f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            curveToRelative(0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.671f, -1.5f, 1.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
