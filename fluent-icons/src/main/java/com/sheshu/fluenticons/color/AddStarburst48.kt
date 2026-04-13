package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AddStarburst48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AddStarburst48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC470),
                    0.251092f to Color(0xFFFF835C),
                    0.550473f to Color(0xFFF24A9D),
                    0.813923f to Color(0xFFB339F0)
                ),
                center = Offset(52.4714f, 52.412f),
                radius = 97.2587f
            )
        ) {
            moveTo(25.183f, 2.58f)
            curveToRelative(-0.6f, -0.772f, -1.767f, -0.772f, -2.368f, 0f)
            lineToRelative(-3.388f, 4.356f)
            lineToRelative(-5.112f, -2.078f)
            curveToRelative(-0.907f, -0.369f, -1.917f, 0.215f, -2.051f, 1.184f)
            lineToRelative(-0.756f, 5.467f)
            lineToRelative(-5.467f, 0.756f)
            curveToRelative(-0.97f, 0.134f, -1.553f, 1.144f, -1.184f, 2.05f)
            lineToRelative(2.078f, 5.113f)
            lineToRelative(-4.356f, 3.388f)
            curveToRelative(-0.772f, 0.6f, -0.772f, 1.768f, 0f, 2.368f)
            lineToRelative(4.356f, 3.388f)
            lineToRelative(-2.078f, 5.113f)
            curveTo(4.488f, 34.59f, 5.072f, 35.6f, 6.04f, 35.735f)
            lineToRelative(5.467f, 0.757f)
            lineToRelative(0.756f, 5.466f)
            curveToRelative(0.134f, 0.97f, 1.144f, 1.553f, 2.05f, 1.184f)
            lineToRelative(5.113f, -2.078f)
            lineToRelative(3.388f, 4.356f)
            curveToRelative(0.6f, 0.772f, 1.767f, 0.772f, 2.368f, 0f)
            lineToRelative(3.388f, -4.356f)
            lineToRelative(5.113f, 2.078f)
            curveToRelative(0.906f, 0.369f, 1.916f, -0.215f, 2.05f, -1.184f)
            lineToRelative(0.756f, -5.466f)
            lineToRelative(5.467f, -0.757f)
            curveToRelative(0.97f, -0.134f, 1.553f, -1.144f, 1.184f, -2.05f)
            lineToRelative(-2.078f, -5.113f)
            lineToRelative(4.356f, -3.388f)
            curveToRelative(0.772f, -0.6f, 0.772f, -1.768f, 0f, -2.368f)
            lineToRelative(-4.356f, -3.388f)
            lineToRelative(2.078f, -5.113f)
            curveToRelative(0.369f, -0.906f, -0.215f, -1.916f, -1.184f, -2.05f)
            lineToRelative(-5.467f, -0.756f)
            lineToRelative(-0.756f, -5.467f)
            curveToRelative(-0.134f, -0.97f, -1.144f, -1.553f, -2.05f, -1.184f)
            lineTo(28.57f, 6.936f)
            lineTo(25.183f, 2.58f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0238693f to Color(0xFFFFC8D7),
                    0.807402f to Color.White
                ),
                start = Offset(32.611f, 39.6464f),
                end = Offset(11.6255f, 26.053f)
            ),
            fillAlpha = 0.95f
        ) {
            moveTo(24f, 14f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(14.56f, 25.25f, 14f, 24.69f, 14f, 24f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
