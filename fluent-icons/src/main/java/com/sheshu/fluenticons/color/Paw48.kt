package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Paw48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Paw48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(16.6585f, 22.9246f),
                end = Offset(26.5323f, 42.9908f)
            )
        ) {
            moveTo(10f, 34f)
            curveToRelative(0f, -7.732f, 6.268f, -14f, 14f, -14f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            curveToRelative(0f, 0.17f, -0.003f, 0.34f, -0.01f, 0.508f)
            curveToRelative(-0.09f, 2.551f, -1.478f, 4.464f, -3.353f, 5.694f)
            curveTo(32.789f, 41.415f, 30.433f, 42f, 28.169f, 42f)
            horizontalLineToRelative(-8.338f)
            curveToRelative(-2.264f, 0f, -4.62f, -0.585f, -6.468f, -1.798f)
            curveToRelative(-1.875f, -1.23f, -3.263f, -3.143f, -3.354f, -5.694f)
            curveTo(10.003f, 34.34f, 10f, 34.17f, 10f, 34f)
            close()
            moveToRelative(8.25f, -28f)
            curveToRelative(-2.84f, 0f, -4.75f, 2.7f, -4.75f, 5.5f)
            reflectiveCurveToRelative(1.91f, 5.5f, 4.75f, 5.5f)
            reflectiveCurveTo(23f, 14.3f, 23f, 11.5f)
            reflectiveCurveTo(21.09f, 6f, 18.25f, 6f)
            close()
            moveTo(3f, 17.5f)
            curveTo(3f, 14.7f, 4.91f, 12f, 7.75f, 12f)
            reflectiveCurveToRelative(4.75f, 2.7f, 4.75f, 5.5f)
            reflectiveCurveTo(10.59f, 23f, 7.75f, 23f)
            reflectiveCurveTo(3f, 20.3f, 3f, 17.5f)
            close()
            moveToRelative(22.5f, -6f)
            curveToRelative(0f, -2.8f, 1.91f, -5.5f, 4.75f, -5.5f)
            reflectiveCurveTo(35f, 8.7f, 35f, 11.5f)
            reflectiveCurveTo(33.09f, 17f, 30.25f, 17f)
            reflectiveCurveToRelative(-4.75f, -2.7f, -4.75f, -5.5f)
            close()
            moveToRelative(10f, 6f)
            curveToRelative(0f, -2.8f, 1.91f, -5.5f, 4.75f, -5.5f)
            reflectiveCurveTo(45f, 14.7f, 45f, 17.5f)
            reflectiveCurveTo(43.09f, 23f, 40.25f, 23f)
            reflectiveCurveToRelative(-4.75f, -2.7f, -4.75f, -5.5f)
            close()
        }
    }.build()
}
