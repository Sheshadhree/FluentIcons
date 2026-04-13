package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Food48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Food48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(23.8462f, 6.5f),
                end = Offset(57.9109f, 17.839f)
            )
        ) {
            moveTo(30.847f, 24.912f)
            lineTo(30.91f, 24f)
            horizontalLineToRelative(-1.66f)
            curveTo(27.455f, 24f, 26f, 22.545f, 26f, 20.75f)
            verticalLineToRelative(-5.5f)
            curveTo(26f, 9.037f, 31.037f, 4f, 37.25f, 4f)
            horizontalLineToRelative(0.5f)
            curveTo(38.44f, 4f, 39f, 4.56f, 39f, 5.25f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 0.49f, 0.185f, 3.196f, 0.403f, 6.368f)
            lineToRelative(0.01f, 0.13f)
            curveTo(39.684f, 33.206f, 40f, 37.79f, 40f, 39f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -1.089f, 0.255f, -5.21f, 0.503f, -8.984f)
            curveToRelative(0.125f, -1.903f, 0.25f, -3.742f, 0.344f, -5.104f)
            close()
            moveTo(10.614f, 4f)
            curveTo(9.966f, 4f, 9.353f, 4.463f, 9.247f, 5.176f)
            curveTo(9.107f, 6.124f, 8f, 13.666f, 8f, 17f)
            curveToRelative(0f, 2.196f, 0.946f, 4.174f, 2.448f, 5.544f)
            curveToRelative(0.695f, 0.633f, 1.052f, 1.273f, 1.052f, 1.842f)
            curveToRelative(0f, 0.045f, -0.001f, 0.082f, -0.005f, 0.122f)
            curveTo(11.401f, 25.682f, 10.5f, 36.976f, 10.5f, 39f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -2.024f, -0.901f, -13.319f, -0.995f, -14.492f)
            curveToRelative(-0.004f, -0.04f, -0.005f, -0.077f, -0.005f, -0.122f)
            curveToRelative(0f, -0.569f, 0.357f, -1.209f, 1.052f, -1.842f)
            curveTo(22.054f, 21.174f, 23f, 19.196f, 23f, 17f)
            curveToRelative(0f, -3.334f, -1.107f, -10.88f, -1.247f, -11.825f)
            curveTo(21.647f, 4.464f, 21.036f, 4f, 20.387f, 4f)
            horizontalLineToRelative(-0.018f)
            curveToRelative(-0.796f, 0f, -1.367f, 0.655f, -1.367f, 1.37f)
            verticalLineToRelative(10.51f)
            curveToRelative(0f, 0.619f, -0.502f, 1.12f, -1.12f, 1.12f)
            curveToRelative(-0.619f, 0f, -1.12f, -0.501f, -1.12f, -1.12f)
            verticalLineTo(5.319f)
            curveTo(16.795f, 4.605f, 16.226f, 4f, 15.502f, 4f)
            reflectiveCurveToRelative(-1.294f, 0.605f, -1.262f, 1.319f)
            verticalLineTo(15.88f)
            curveToRelative(0f, 0.619f, -0.501f, 1.12f, -1.12f, 1.12f)
            curveToRelative(-0.619f, 0f, -1.12f, -0.501f, -1.12f, -1.12f)
            verticalLineTo(5.37f)
            curveTo(12f, 4.655f, 11.428f, 4f, 10.633f, 4f)
            horizontalLineToRelative(-0.02f)
            close()
        }
    }.build()
}
