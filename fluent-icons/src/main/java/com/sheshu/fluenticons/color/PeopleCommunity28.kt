package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF008CE2),
                    1f to Color(0xFF0068C6)
                ),
                center = Offset(4.02667f, 8.12222f),
                radius = 5.73964f
            )
        ) {
            moveTo(5.5f, 6f)
            curveTo(3.567f, 6f, 2f, 7.567f, 2f, 9.5f)
            reflectiveCurveTo(3.567f, 13f, 5.5f, 13f)
            reflectiveCurveTo(9f, 11.433f, 9f, 9.5f)
            reflectiveCurveTo(7.433f, 6f, 5.5f, 6f)
            close()
            moveToRelative(17f, 0f)
            curveTo(20.567f, 6f, 19f, 7.567f, 19f, 9.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveTo(26f, 11.433f, 26f, 9.5f)
            reflectiveCurveTo(24.433f, 6f, 22.5f, 6f)
            close()
            moveTo(14f, 3f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(4.428f, 11.33f)
            curveToRelative(-0.934f, -0.25f, -1.894f, 0.304f, -2.144f, 1.238f)
            lineToRelative(-0.84f, 3.139f)
            curveToRelative(-0.716f, 2.667f, 0.867f, 5.409f, 3.535f, 6.124f)
            curveToRelative(2.667f, 0.714f, 5.409f, -0.869f, 6.123f, -3.536f)
            lineToRelative(0.841f, -3.14f)
            curveToRelative(0.25f, -0.933f, -0.303f, -1.892f, -1.237f, -2.142f)
            lineToRelative(-6.278f, -1.683f)
            close()
            moveToRelative(-8.852f, 0f)
            curveToRelative(0.934f, -0.25f, 1.893f, 0.304f, 2.143f, 1.238f)
            lineToRelative(0.841f, 3.139f)
            curveToRelative(0.715f, 2.667f, -0.868f, 5.409f, -3.535f, 6.124f)
            curveToRelative(-2.667f, 0.714f, -5.41f, -0.869f, -6.124f, -3.536f)
            lineToRelative(-0.84f, -3.14f)
            curveToRelative(-0.251f, -0.933f, 0.303f, -1.892f, 1.236f, -2.142f)
            lineToRelative(6.279f, -1.683f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(13.037f, 17.2134f),
                radius = 7.20213f
            )
        ) {
            moveTo(10.75f, 13f)
            curveTo(9.784f, 13f, 9f, 13.784f, 9f, 14.75f)
            verticalLineTo(20f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-5.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
