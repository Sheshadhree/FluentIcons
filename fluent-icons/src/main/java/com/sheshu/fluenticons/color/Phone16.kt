package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Phone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Phone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCB7DF8),
                    0.412452f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(4f, 0.5625f),
                radius = 17.632f
            )
        ) {
            moveTo(4f, 2.75f)
            curveTo(4f, 1.784f, 4.784f, 1f, 5.75f, 1f)
            horizontalLineToRelative(4.5f)
            curveTo(11.216f, 1f, 12f, 1.784f, 12f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(4.784f, 15f, 4f, 14.216f, 4f, 13.25f)
            verticalLineTo(2.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDECBFF),
                    1f to Color(0xFFD1D1FF)
                ),
                center = Offset(6.03125f, 12.0667f),
                radius = 5.24774f
            )
        ) {
            moveTo(7f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(6.724f, 13f, 7f, 13f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 12f, 9f, 12f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
