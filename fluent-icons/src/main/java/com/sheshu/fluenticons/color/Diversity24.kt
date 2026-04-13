package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Diversity24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Diversity24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(8.33858f, 8.89185f),
                end = Offset(19.2121f, 20.111f)
            )
        ) {
            moveTo(17.625f, 12.745f)
            curveToRelative(-0.387f, -0.223f, -0.863f, -0.223f, -1.25f, 0f)
            lineToRelative(-2.748f, 1.586f)
            curveToRelative(-0.386f, 0.224f, -0.625f, 0.636f, -0.625f, 1.083f)
            verticalLineToRelative(3.172f)
            curveToRelative(0f, 0.447f, 0.239f, 0.86f, 0.625f, 1.083f)
            lineToRelative(2.748f, 1.586f)
            curveToRelative(0.387f, 0.224f, 0.863f, 0.224f, 1.25f, 0f)
            lineToRelative(2.748f, -1.586f)
            curveToRelative(0.386f, -0.223f, 0.625f, -0.636f, 0.625f, -1.083f)
            verticalLineToRelative(-3.172f)
            curveToRelative(0f, -0.447f, -0.239f, -0.86f, -0.625f, -1.083f)
            lineToRelative(-2.748f, -1.586f)
            close()
            moveTo(15.25f, 3f)
            curveTo(14.007f, 3f, 13f, 4.007f, 13f, 5.25f)
            verticalLineToRelative(3.5f)
            curveTo(13f, 9.993f, 14.007f, 11f, 15.25f, 11f)
            horizontalLineToRelative(3.5f)
            curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
            verticalLineToRelative(-3.5f)
            curveTo(21f, 4.007f, 19.993f, 3f, 18.75f, 3f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(7f, 13f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(5.55f, 3.898f)
            curveToRelative(0.603f, -1.198f, 2.297f, -1.198f, 2.9f, 0f)
            lineToRelative(2.372f, 4.716f)
            curveTo(11.37f, 9.707f, 10.585f, 11f, 9.372f, 11f)
            horizontalLineTo(4.628f)
            curveToRelative(-1.213f, 0f, -1.999f, -1.293f, -1.45f, -2.386f)
            lineTo(5.55f, 3.898f)
            close()
        }
    }.build()
}
