package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(5.12461f, -0.392807f),
                end = Offset(16.7187f, 23.4768f)
            )
        ) {
            moveTo(10.03f, 3.659f)
            curveToRelative(0.856f, -1.548f, 3.081f, -1.548f, 3.937f, 0f)
            lineToRelative(7.746f, 14.001f)
            curveToRelative(0.83f, 1.5f, -0.255f, 3.34f, -1.969f, 3.34f)
            horizontalLineTo(4.254f)
            curveToRelative(-1.715f, 0f, -2.8f, -1.84f, -1.97f, -3.34f)
            lineToRelative(7.746f, -14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(9.33556f, 8.5f),
                end = Offset(13.7522f, 18.4051f)
            )
        ) {
            moveTo(12.997f, 17f)
            curveToRelative(0f, -0.55f, -0.447f, -0.998f, -0.998f, -0.998f)
            curveToRelative(-0.552f, 0f, -0.999f, 0.447f, -0.999f, 0.999f)
            curveTo(11f, 17.552f, 11.447f, 18f, 11.999f, 18f)
            curveToRelative(0.551f, 0f, 0.998f, -0.448f, 0.998f, -1f)
            close()
            moveToRelative(-0.259f, -7.852f)
            curveTo(12.688f, 8.782f, 12.374f, 8.5f, 11.995f, 8.5f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            lineToRelative(0.004f, 4.502f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.05f, 0.366f, 0.364f, 0.648f, 0.743f, 0.648f)
            curveToRelative(0.415f, 0f, 0.75f, -0.337f, 0.75f, -0.751f)
            lineToRelative(-0.004f, -4.502f)
            lineToRelative(-0.007f, -0.101f)
            close()
        }
    }.build()
}
