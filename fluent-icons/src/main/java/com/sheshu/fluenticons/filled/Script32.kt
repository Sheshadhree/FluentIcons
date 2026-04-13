package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Script32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Script32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.998f, 2f)
            curveToRelative(0.16f, 0f, 0.34f, 0.02f, 0.5f, 0.04f)
            curveToRelative(0.18f, 0.02f, 0.34f, 0.06f, 0.5f, 0.1f)
            curveToRelative(-1.6f, 0.42f, -2.8f, 1.78f, -2.96f, 3.46f)
            curveToRelative(-0.018f, 0.185f, -0.029f, 0.254f, -0.034f, 0.29f)
            lineTo(24f, 5.921f)
            verticalLineTo(27f)
            curveToRelative(0f, 1.656f, -1.346f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.346f, -3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.104f, -0.896f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            verticalLineTo(7f)
            curveToRelative(0f, -2.762f, 2.238f, -5f, 5f, -5f)
            horizontalLineToRelative(14.998f)
            close()
            moveTo(16f, 24f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.13f, 0.392f, 2.162f, 1.026f, 3f)
            horizontalLineToRelative(-0.47f)
            curveToRelative(-2.51f, 0f, -3.066f, -0.002f, -4.728f, 0f)
            horizontalLineTo(11.1f)
            curveToRelative(-2.652f, 0.004f, -4.14f, 0.012f, -5f, 0f)
            horizontalLineTo(6f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(13f)
            close()
            moveTo(28f, 4f)
            curveToRelative(-0.36f, 0f, -0.7f, 0.1f, -1f, 0.28f)
            curveToRelative(-0.6f, 0.34f, -1f, 0.98f, -1f, 1.72f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
