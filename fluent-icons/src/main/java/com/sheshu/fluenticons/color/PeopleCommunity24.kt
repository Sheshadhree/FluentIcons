package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(11.3741f, 5.28227f),
                radius = 4.05997f
            )
        ) {
            moveTo(12f, 3f)
            curveToRelative(-1.795f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            reflectiveCurveTo(10.205f, 9.5f, 12f, 9.5f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            reflectiveCurveTo(13.795f, 3f, 12f, 3f)
            close()
            moveTo(5f, 5f)
            curveTo(3.343f, 5f, 2f, 6.343f, 2f, 8f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(14f, 0f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(-3.61f, 6.442f)
            curveToRelative(-0.933f, -0.25f, -1.893f, 0.303f, -2.143f, 1.237f)
            lineToRelative(-0.712f, 2.656f)
            curveToRelative(-0.643f, 2.4f, 0.782f, 4.868f, 3.182f, 5.512f)
            curveToRelative(2.4f, 0.643f, 4.868f, -0.782f, 5.512f, -3.182f)
            lineToRelative(0.711f, -2.657f)
            curveToRelative(0.25f, -0.933f, -0.303f, -1.893f, -1.237f, -2.143f)
            lineToRelative(-5.313f, -1.423f)
            close()
            moveToRelative(-6.78f, 0f)
            curveToRelative(0.933f, -0.25f, 1.892f, 0.303f, 2.142f, 1.237f)
            lineToRelative(0.712f, 2.656f)
            curveToRelative(0.643f, 2.4f, -0.781f, 4.868f, -3.182f, 5.512f)
            curveToRelative(-2.4f, 0.643f, -4.868f, -0.782f, -5.511f, -3.182f)
            lineToRelative(-0.712f, -2.657f)
            curveToRelative(-0.25f, -0.933f, 0.304f, -1.893f, 1.237f, -2.143f)
            lineToRelative(5.313f, -1.423f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(11.1333f, 14.5112f),
                radius = 6.09533f
            )
        ) {
            moveTo(9.25f, 11f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
