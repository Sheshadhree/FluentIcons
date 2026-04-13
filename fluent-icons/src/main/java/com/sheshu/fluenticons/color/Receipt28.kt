package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Receipt28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Receipt28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFE8401),
                    1f to Color(0xFFCA6407)
                ),
                start = Offset(25f, 20.2f),
                end = Offset(18.4197f, 21.8618f)
            )
        ) {
            moveTo(18f, 17f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(18f)
            verticalLineToRelative(-8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.644682f to Color(0xFFFFB357),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(6.09091f, 3.78571f),
                end = Offset(13.2569f, 24.9283f)
            )
        ) {
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(18.769f, 3f, 20f, 4.231f, 20f, 5.75f)
            verticalLineTo(25f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFCA6407)
                ),
                start = Offset(5.2f, 8f),
                end = Offset(16.814f, 18.9071f)
            )
        ) {
            moveTo(7f, 8.75f)
            curveTo(7f, 8.336f, 7.336f, 8f, 7.75f, 8f)
            horizontalLineToRelative(7.5f)
            curveTo(15.664f, 8f, 16f, 8.336f, 16f, 8.75f)
            reflectiveCurveTo(15.664f, 9.5f, 15.25f, 9.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.336f, 9.5f, 7f, 9.164f, 7f, 8.75f)
            close()
            moveToRelative(0f, 5f)
            curveTo(7f, 13.336f, 7.336f, 13f, 7.75f, 13f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.336f, 14.5f, 7f, 14.164f, 7f, 13.75f)
            close()
            moveTo(7.75f, 18f)
            curveTo(7.336f, 18f, 7f, 18.336f, 7f, 18.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(11.664f, 18f, 11.25f, 18f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
