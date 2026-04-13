package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(4.49717f, -0.343896f),
                end = Offset(13.9721f, 18.9138f)
            )
        ) {
            moveTo(8.681f, 2.785f)
            curveToRelative(0.568f, -1.047f, 2.071f, -1.047f, 2.638f, 0f)
            lineToRelative(6.5f, 12.002f)
            curveTo(18.362f, 15.786f, 17.639f, 17f, 16.502f, 17f)
            horizontalLineTo(3.498f)
            curveToRelative(-1.137f, 0f, -1.86f, -1.215f, -1.319f, -2.215f)
            lineToRelative(6.503f, -12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(8f, 7f),
                end = Offset(11.6029f, 14.6861f)
            )
        ) {
            moveTo(10.5f, 7.5f)
            curveTo(10.5f, 7.224f, 10.276f, 7f, 10f, 7f)
            reflectiveCurveTo(9.5f, 7.224f, 9.5f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(-0.5f, 7f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 13f, 10f, 13f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 14.5f, 10f, 14.5f)
            close()
        }
    }.build()
}
