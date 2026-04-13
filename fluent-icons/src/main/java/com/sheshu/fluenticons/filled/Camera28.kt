package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Camera28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Camera28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.951f, 2.504f)
            curveToRelative(0.776f, 0f, 1.498f, 0.4f, 1.909f, 1.059f)
            lineTo(20.381f, 6f)
            horizontalLineToRelative(2.369f)
            curveTo(24.545f, 6f, 26f, 7.456f, 26f, 9.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 25f, 2f, 23.546f, 2f, 21.75f)
            verticalLineTo(9.25f)
            curveTo(2f, 7.456f, 3.455f, 6f, 5.25f, 6f)
            horizontalLineToRelative(2.569f)
            lineTo(9.2f, 3.623f)
            curveToRelative(0.403f, -0.693f, 1.144f, -1.12f, 1.945f, -1.12f)
            horizontalLineToRelative(5.805f)
            close()
            moveToRelative(-2.951f, 7f)
            curveToRelative(-3.038f, 0f, -5.5f, 2.462f, -5.5f, 5.5f)
            curveToRelative(0f, 3.037f, 2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.463f, 5.5f, -5.5f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 2.209f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.791f, -4f, -4f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
