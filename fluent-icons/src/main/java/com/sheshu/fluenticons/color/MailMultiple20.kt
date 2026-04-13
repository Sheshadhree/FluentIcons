package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.MailMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.MailMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color(0xFF1B44B1))) {
            moveTo(4f, 7.5f)
            verticalLineToRelative(7f)
            curveTo(4f, 15.88f, 5.12f, 17f, 6.5f, 17f)
            horizontalLineToRelative(7f)
            curveToRelative(2.485f, 0f, 4.5f, -2.014f, 4.5f, -4.5f)
            verticalLineToRelative(-5f)
            curveTo(18f, 6.12f, 16.88f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-9f)
            curveTo(5.12f, 5f, 4f, 6.12f, 4f, 7.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF367AF2))) {
            moveTo(2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.22807f to Color(0x000094F0),
                    0.430619f to Color(0xFF0094F0)
                ),
                start = Offset(10.7773f, 7.36222f),
                end = Offset(14.9746f, 14.7158f)
            )
        ) {
            moveTo(2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.22807f to Color(0x000094F0),
                    0.430619f to Color(0xFF0094F0)
                ),
                start = Offset(7f, 6.5f),
                end = Offset(2.33333f, 15.1667f)
            )
        ) {
            moveTo(2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x002764E7),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(12.3906f, 10.25f),
                end = Offset(13.4083f, 15.8576f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                start = Offset(11.1667f, 6.66667f),
                end = Offset(12.4716f, 16.2224f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    0.461792f to Color(0xFF29C3FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(6.15912f, 0.818248f),
                end = Offset(11.0949f, 12.7285f)
            )
        ) {
            moveTo(16f, 5.5f)
            curveTo(16f, 4.12f, 14.88f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(1f)
            lineToRelative(6.746f, 3.431f)
            lineToRelative(0.082f, 0.038f)
            curveToRelative(0.139f, 0.052f, 0.295f, 0.039f, 0.426f, -0.038f)
            lineTo(16f, 6.5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}
