package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(7.71429f, 4f),
                end = Offset(11.3889f, 16.0988f)
            )
        ) {
            moveTo(2f, 5.75f)
            curveTo(2f, 4.784f, 2.784f, 4f, 3.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(17.216f, 4f, 18f, 4.784f, 18f, 5.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 16f, 2f, 15.216f, 2f, 14.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(12.4762f, 5.47368f),
                end = Offset(15.575f, 22.6667f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(2f, 5.75f)
            curveTo(2f, 4.784f, 2.784f, 4f, 3.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(17.216f, 4f, 18f, 4.784f, 18f, 5.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 16f, 2f, 15.216f, 2f, 14.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(12.6364f, 7.53846f),
                end = Offset(14.6529f, 15.1991f)
            )
        ) {
            moveTo(11.5f, 8f)
            curveTo(11.224f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(11.224f, 9f, 11.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(14.776f, 9f, 15f, 8.776f, 15f, 8.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 11f, 14.5f, 11f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4f, 11.699f)
            curveToRelative(0f, -0.524f, 0.425f, -0.949f, 0.949f, -0.949f)
            horizontalLineTo(8.05f)
            curveToRelative(0.525f, 0f, 0.95f, 0.425f, 0.95f, 0.949f)
            curveToRelative(0f, 0.847f, -0.577f, 1.585f, -1.399f, 1.791f)
            lineToRelative(-0.059f, 0.015f)
            curveToRelative(-0.684f, 0.17f, -1.4f, 0.17f, -2.084f, 0f)
            lineToRelative(-0.06f, -0.015f)
            curveTo(4.578f, 13.284f, 4f, 12.546f, 4f, 11.699f)
            close()
            moveTo(8f, 8.5f)
            curveTo(8f, 9.328f, 7.328f, 10f, 6.5f, 10f)
            reflectiveCurveTo(5f, 9.328f, 5f, 8.5f)
            reflectiveCurveTo(5.672f, 7f, 6.5f, 7f)
            reflectiveCurveTo(8f, 7.672f, 8f, 8.5f)
            close()
        }
    }.build()
}
