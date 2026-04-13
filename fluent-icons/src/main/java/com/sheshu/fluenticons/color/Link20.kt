package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Link20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Link20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-3.14286f, 2.5f),
                end = Offset(3.20339f, 21.5848f)
            )
        ) {
            moveTo(14f, 6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 2.142f, -1.684f, 3.891f, -3.8f, 3.995f)
            lineTo(14f, 14f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(12f, 12.5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -1.325f, -1.031f, -2.41f, -2.336f, -2.495f)
            lineTo(14f, 7.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(12f, 6f)
            horizontalLineToRelative(2f)
            close()
            moveTo(8f, 6f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(8f, 7.5f)
            horizontalLineTo(6f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            curveToRelative(0f, 1.325f, 1.032f, 2.41f, 2.336f, 2.495f)
            lineTo(6f, 12.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(8f, 14f)
            horizontalLineTo(6f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -2.142f, 1.684f, -3.891f, 3.8f, -3.995f)
            lineTo(6f, 6f)
            horizontalLineToRelative(2f)
            close()
            moveTo(6.25f, 9.25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(13.75f, 10.75f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(6.25f, 9.25f)
            horizontalLineToRelative(7.5f)
            horizontalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
