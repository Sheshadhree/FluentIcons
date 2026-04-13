package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Alert24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Alert24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(12f, 17.5f),
                end = Offset(12.0194f, 20.9994f)
            )
        ) {
            moveTo(15f, 18f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(21.0274f, 17.9953f),
                end = Offset(5.57837f, 3.77571f)
            )
        ) {
            moveTo(12f, 2.004f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            verticalLineToRelative(3.998f)
            lineToRelative(1.418f, 3.16f)
            curveToRelative(0.055f, 0.123f, 0.084f, 0.255f, 0.084f, 0.39f)
            curveToRelative(0f, 0.524f, -0.426f, 0.95f, -0.95f, 0.95f)
            horizontalLineToRelative(-16.1f)
            curveToRelative(-0.134f, 0f, -0.266f, -0.029f, -0.388f, -0.083f)
            curveToRelative(-0.479f, -0.215f, -0.693f, -0.777f, -0.479f, -1.256f)
            lineToRelative(1.415f, -3.16f)
            verticalLineTo(9.49f)
            lineToRelative(0.005f, -0.25f)
            curveTo(4.644f, 5.211f, 7.955f, 2.004f, 12f, 2.004f)
            close()
        }
    }.build()
}
