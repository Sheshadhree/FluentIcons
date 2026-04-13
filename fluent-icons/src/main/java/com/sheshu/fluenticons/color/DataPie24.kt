package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataPie24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataPie24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    0.640625f to Color(0xFFEA71EF)
                ),
                start = Offset(19.9664f, 22.0001f),
                end = Offset(-8.77982f, -6.74613f)
            )
        ) {
            moveTo(11f, 4.784f)
            curveToRelative(0f, -0.21f, -0.089f, -0.412f, -0.244f, -0.554f)
            curveToRelative(-0.155f, -0.142f, -0.364f, -0.212f, -0.573f, -0.193f)
            curveTo(5.595f, 4.45f, 2f, 8.305f, 2f, 13f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            curveToRelative(4.695f, 0f, 8.55f, -3.595f, 8.963f, -8.183f)
            curveToRelative(0.02f, -0.21f, -0.05f, -0.417f, -0.193f, -0.573f)
            curveTo(19.628f, 13.09f, 19.427f, 13f, 19.216f, 13f)
            horizontalLineTo(11f)
            verticalLineTo(4.784f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE23CB4),
                    1f to Color(0xFFEA71EF)
                ),
                start = Offset(21.2049f, 9.75896f),
                end = Offset(14.3993f, 2.00366f)
            )
        ) {
            moveTo(12.728f, 2.216f)
            curveToRelative(0.145f, -0.142f, 0.342f, -0.218f, 0.544f, -0.212f)
            curveToRelative(4.755f, 0.142f, 8.583f, 3.97f, 8.724f, 8.724f)
            curveToRelative(0.006f, 0.202f, -0.07f, 0.399f, -0.212f, 0.544f)
            curveToRelative(-0.14f, 0.146f, -0.335f, 0.228f, -0.538f, 0.228f)
            horizontalLineTo(13.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(2.754f)
            curveToRelative(0f, -0.203f, 0.082f, -0.397f, 0.228f, -0.538f)
            close()
        }
    }.build()
}
