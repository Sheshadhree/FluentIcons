package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatCursor16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatCursor16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 0.364f, -0.039f, 0.718f, -0.113f, 1.06f)
            lineToRelative(-0.9f, -0.737f)
            curveTo(10.996f, 6.217f, 11f, 6.11f, 11f, 6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveTo(3f, 3.79f, 3f, 6f)
            curveToRelative(0f, 0.763f, 0.213f, 1.474f, 0.583f, 2.08f)
            curveToRelative(0.074f, 0.122f, 0.093f, 0.27f, 0.051f, 0.406f)
            lineTo(3.251f, 9.745f)
            lineToRelative(1.257f, -0.383f)
            curveTo(4.645f, 9.32f, 4.793f, 9.34f, 4.915f, 9.414f)
            curveTo(5.52f, 9.785f, 6.234f, 10f, 6.998f, 10f)
            verticalLineToRelative(1f)
            curveToRelative(-0.872f, 0f, -1.693f, -0.224f, -2.407f, -0.618f)
            lineToRelative(-1.945f, 0.592f)
            curveToRelative(-0.177f, 0.054f, -0.369f, 0.006f, -0.5f, -0.125f)
            curveToRelative(-0.13f, -0.13f, -0.178f, -0.322f, -0.124f, -0.499f)
            lineToRelative(0.592f, -1.947f)
            curveTo(2.223f, 7.689f, 2f, 6.87f, 2f, 6f)
            close()
            moveToRelative(12.72f, 4.67f)
            curveToRelative(0.546f, 0.447f, 0.23f, 1.33f, -0.475f, 1.33f)
            horizontalLineTo(11.26f)
            curveToRelative(-0.157f, 0f, -0.304f, 0.074f, -0.399f, 0.2f)
            lineToRelative(-1.514f, 2.005f)
            curveToRelative(-0.434f, 0.574f, -1.35f, 0.267f, -1.349f, -0.453f)
            lineTo(8f, 6.753f)
            curveToRelative(0f, -0.633f, 0.735f, -0.98f, 1.225f, -0.58f)
            lineToRelative(5.496f, 4.497f)
            close()
        }
    }.build()
}
