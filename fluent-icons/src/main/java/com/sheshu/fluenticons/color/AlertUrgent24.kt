package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AlertUrgent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AlertUrgent24",
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
                start = Offset(11.4375f, 18.1875f),
                end = Offset(12.7559f, 21f)
            )
        ) {
            moveTo(14.25f, 18.75f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveToRelative(-2.25f, -1.007f, -2.25f, -2.25f)
            reflectiveCurveTo(10.757f, 16.5f, 12f, 16.5f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(17.2595f, 16.6396f),
                end = Offset(4.82227f, 8.2516f)
            )
        ) {
            moveTo(6.711f, 6.515f)
            curveToRelative(2.862f, -1.274f, 6.205f, -0.07f, 7.6f, 2.746f)
            lineToRelative(0.098f, 0.209f)
            lineToRelative(1.288f, 2.892f)
            lineToRelative(1.698f, 1.47f)
            curveToRelative(0.093f, 0.08f, 0.173f, 0.173f, 0.266f, 0.324f)
            lineToRelative(0.059f, 0.115f)
            curveToRelative(0.28f, 0.631f, -0.006f, 1.37f, -0.637f, 1.649f)
            lineTo(6.755f, 20.49f)
            curveToRelative(-0.16f, 0.07f, -0.332f, 0.107f, -0.506f, 0.107f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            lineToRelative(-0.001f, -2.343f)
            lineToRelative(-1.242f, -2.791f)
            curveToRelative(-1.314f, -2.95f, 0.009f, -6.386f, 2.954f, -7.698f)
            close()
            moveToRelative(9.15f, -4.421f)
            curveToRelative(2.086f, 1.14f, 3.652f, 2.602f, 4.682f, 4.387f)
            curveToRelative(1.03f, 1.784f, 1.515f, 3.872f, 1.459f, 6.248f)
            curveToRelative(-0.01f, 0.414f, -0.354f, 0.742f, -0.768f, 0.732f)
            curveToRelative(-0.414f, -0.01f, -0.742f, -0.354f, -0.732f, -0.768f)
            curveToRelative(0.05f, -2.111f, -0.372f, -3.927f, -1.258f, -5.462f)
            curveToRelative(-0.886f, -1.536f, -2.249f, -2.808f, -4.102f, -3.821f)
            curveToRelative(-0.363f, -0.199f, -0.497f, -0.654f, -0.298f, -1.018f)
            curveToRelative(0.198f, -0.363f, 0.654f, -0.497f, 1.017f, -0.298f)
            close()
            moveToRelative(-0.237f, 3.6f)
            curveToRelative(0.967f, 0.527f, 1.742f, 1.295f, 2.316f, 2.29f)
            curveToRelative(0.574f, 0.994f, 0.851f, 2.049f, 0.824f, 3.15f)
            curveToRelative(-0.01f, 0.414f, -0.354f, 0.742f, -0.768f, 0.732f)
            curveToRelative(-0.414f, -0.01f, -0.741f, -0.354f, -0.731f, -0.768f)
            curveToRelative(0.02f, -0.822f, -0.186f, -1.606f, -0.624f, -2.365f)
            curveToRelative(-0.438f, -0.759f, -1.014f, -1.328f, -1.735f, -1.722f)
            curveToRelative(-0.364f, -0.198f, -0.498f, -0.654f, -0.3f, -1.017f)
            curveToRelative(0.199f, -0.364f, 0.654f, -0.498f, 1.018f, -0.3f)
            close()
        }
    }.build()
}
