package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.471f, 6.228f)
            curveToRelative(1.617f, -2.99f, 5.916f, -2.966f, 7.5f, 0.042f)
            lineToRelative(15.533f, 29.502f)
            curveToRelative(1.49f, 2.83f, -0.562f, 6.23f, -3.76f, 6.23f)
            horizontalLineTo(8.255f)
            curveToRelative(-3.22f, 0f, -5.27f, -3.44f, -3.738f, -6.272f)
            lineTo(20.47f, 6.228f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(10.2499f, -1.93776f),
                end = Offset(34.4523f, 46.5854f)
            )
        ) {
            moveTo(20.471f, 6.228f)
            curveToRelative(1.617f, -2.99f, 5.916f, -2.966f, 7.5f, 0.042f)
            lineToRelative(15.533f, 29.502f)
            curveToRelative(1.49f, 2.83f, -0.562f, 6.23f, -3.76f, 6.23f)
            horizontalLineTo(8.255f)
            curveToRelative(-3.22f, 0f, -5.27f, -3.44f, -3.738f, -6.272f)
            lineTo(20.47f, 6.228f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF242424)
                ),
                start = Offset(18.6667f, 15f),
                end = Offset(28.2744f, 35.4964f)
            )
        ) {
            moveTo(24f, 15f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-11.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveToRelative(0f, 20f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
