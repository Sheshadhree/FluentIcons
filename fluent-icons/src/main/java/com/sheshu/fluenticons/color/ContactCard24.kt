package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(9.14286f, 4f),
                end = Offset(14.3116f, 19.9499f)
            )
        ) {
            moveTo(19.75f, 4f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineToRelative(11.505f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(15.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(15.0952f, 5.96548f),
                end = Offset(19.4859f, 28.7967f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(19.75f, 4f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineToRelative(11.505f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(15.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(14.956f, 8.92352f),
                end = Offset(17.0966f, 18.6856f)
            )
        ) {
            moveTo(13.252f, 12.996f)
            horizontalLineToRelative(4.498f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineToRelative(-0.102f, 0.007f)
            horizontalLineToRelative(-4.498f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.283f, -0.693f, 0.649f, -0.743f)
            lineToRelative(0.101f, -0.007f)
            horizontalLineToRelative(4.498f)
            horizontalLineToRelative(-4.498f)
            close()
            moveToRelative(0f, -3.496f)
            horizontalLineToRelative(4.498f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(17.75f, 11f)
            horizontalLineToRelative(-4.498f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.283f, -0.694f, 0.649f, -0.743f)
            lineTo(13.252f, 9.5f)
            horizontalLineToRelative(4.498f)
            horizontalLineToRelative(-4.498f)
            close()
            moveToRelative(-3.502f, 3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(0.493f)
            lineToRelative(-0.008f, 0.108f)
            curveToRelative(-0.163f, 1.113f, -1.094f, 1.65f, -2.492f, 1.65f)
            reflectiveCurveToRelative(-2.33f, -0.537f, -2.492f, -1.65f)
            lineTo(5.5f, 13.74f)
            verticalLineToRelative(-0.49f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.5f)
            close()
            moveTo(8f, 8.502f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.build()
}
