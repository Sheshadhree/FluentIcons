package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Gauge24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Gauge24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF4F4F4),
                    1f to Color(0xFFCBCBCB)
                ),
                start = Offset(9.14286f, 2f),
                end = Offset(16.8054f, 20.9218f)
            )
        ) {
            moveTo(22f, 12f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    0.501441f to Color(0xFFFF921F),
                    1f to Color(0xFFE82C41)
                ),
                center = Offset(4.46f, 17.317f),
                radius = 15.6599f
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-2.832f, -2.83f, -2.832f, -7.421f, 0f, -10.253f)
            curveToRelative(1.844f, -1.844f, 4.436f, -2.486f, 6.798f, -1.928f)
            curveToRelative(0.403f, 0.095f, 0.653f, 0.499f, 0.558f, 0.902f)
            curveToRelative(-0.095f, 0.403f, -0.5f, 0.653f, -0.902f, 0.557f)
            curveToRelative(-1.878f, -0.443f, -3.932f, 0.068f, -5.394f, 1.53f)
            curveToRelative(-2.245f, 2.246f, -2.245f, 5.886f, 0f, 8.132f)
            close()
            moveToRelative(9.954f, -6.924f)
            curveToRelative(0.39f, -0.137f, 0.819f, 0.069f, 0.955f, 0.46f)
            curveToRelative(0.89f, 2.544f, 0.32f, 5.489f, -1.716f, 7.524f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.061f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(1.613f, -1.613f, 2.068f, -3.948f, 1.362f, -5.969f)
            curveToRelative(-0.137f, -0.391f, 0.069f, -0.819f, 0.46f, -0.955f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0042B870),
                    0.579857f to Color(0xFF42B870)
                ),
                start = Offset(8.5f, 14.0001f),
                end = Offset(6.17929f, 16.7148f)
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-2.832f, -2.83f, -2.832f, -7.421f, 0f, -10.253f)
            curveToRelative(1.844f, -1.844f, 4.436f, -2.486f, 6.798f, -1.928f)
            curveToRelative(0.403f, 0.095f, 0.653f, 0.499f, 0.558f, 0.902f)
            curveToRelative(-0.095f, 0.403f, -0.5f, 0.653f, -0.902f, 0.557f)
            curveToRelative(-1.878f, -0.443f, -3.932f, 0.068f, -5.394f, 1.53f)
            curveToRelative(-2.245f, 2.246f, -2.245f, 5.886f, 0f, 8.132f)
            close()
            moveToRelative(9.954f, -6.924f)
            curveToRelative(0.39f, -0.137f, 0.819f, 0.069f, 0.955f, 0.46f)
            curveToRelative(0.89f, 2.544f, 0.32f, 5.489f, -1.716f, 7.524f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.061f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(1.613f, -1.613f, 2.068f, -3.948f, 1.362f, -5.969f)
            curveToRelative(-0.137f, -0.391f, 0.069f, -0.819f, 0.46f, -0.955f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00E82C41),
                    0.5625f to Color(0xFFE82C41)
                ),
                start = Offset(15.4799f, 14.3945f),
                end = Offset(17.8179f, 16.7144f)
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-2.832f, -2.83f, -2.832f, -7.421f, 0f, -10.253f)
            curveToRelative(1.844f, -1.844f, 4.436f, -2.486f, 6.798f, -1.928f)
            curveToRelative(0.403f, 0.095f, 0.653f, 0.499f, 0.558f, 0.902f)
            curveToRelative(-0.095f, 0.403f, -0.5f, 0.653f, -0.902f, 0.557f)
            curveToRelative(-1.878f, -0.443f, -3.932f, 0.068f, -5.394f, 1.53f)
            curveToRelative(-2.245f, 2.246f, -2.245f, 5.886f, 0f, 8.132f)
            close()
            moveToRelative(9.954f, -6.924f)
            curveToRelative(0.39f, -0.137f, 0.819f, 0.069f, 0.955f, 0.46f)
            curveToRelative(0.89f, 2.544f, 0.32f, 5.489f, -1.716f, 7.524f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.061f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(1.613f, -1.613f, 2.068f, -3.948f, 1.362f, -5.969f)
            curveToRelative(-0.137f, -0.391f, 0.069f, -0.819f, 0.46f, -0.955f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(10.0234f, 6.51703f),
                end = Offset(15.1733f, 13.1398f)
            )
        ) {
            moveTo(15.88f, 6.667f)
            curveToRelative(0.226f, -0.194f, 0.56f, -0.2f, 0.794f, -0.015f)
            curveToRelative(0.234f, 0.185f, 0.304f, 0.51f, 0.167f, 0.776f)
            lineToRelative(-0.129f, 0.25f)
            lineToRelative(-0.344f, 0.664f)
            curveToRelative(-0.286f, 0.55f, -0.672f, 1.291f, -1.072f, 2.05f)
            curveToRelative(-0.4f, 0.757f, -0.814f, 1.533f, -1.156f, 2.156f)
            curveToRelative(-0.171f, 0.31f, -0.326f, 0.586f, -0.452f, 0.803f)
            curveToRelative(-0.118f, 0.201f, -0.233f, 0.391f, -0.319f, 0.5f)
            curveToRelative(-0.643f, 0.812f, -1.822f, 0.95f, -2.634f, 0.307f)
            curveToRelative(-0.812f, -0.643f, -0.95f, -1.822f, -0.307f, -2.634f)
            curveToRelative(0.086f, -0.109f, 0.244f, -0.265f, 0.413f, -0.425f)
            curveToRelative(0.182f, -0.173f, 0.414f, -0.387f, 0.678f, -0.625f)
            curveToRelative(0.527f, -0.476f, 1.188f, -1.058f, 1.833f, -1.62f)
            curveToRelative(0.645f, -0.564f, 1.277f, -1.11f, 1.747f, -1.516f)
            lineToRelative(0.567f, -0.487f)
            lineToRelative(0.213f, -0.184f)
            close()
        }
    }.build()
}
