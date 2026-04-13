package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShift20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShift20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.139f, 2.528f)
            curveToRelative(-0.598f, -0.704f, -1.68f, -0.704f, -2.278f, 0f)
            lineToRelative(-6.62f, 7.803f)
            curveTo(1.687f, 10.982f, 2.147f, 11.985f, 3f, 11.985f)
            horizontalLineToRelative(3.01f)
            verticalLineToRelative(5.012f)
            curveTo(6.01f, 17.551f, 6.455f, 18f, 7.006f, 18f)
            horizontalLineToRelative(5.986f)
            curveToRelative(0.55f, 0f, 0.998f, -0.449f, 0.998f, -1.003f)
            verticalLineToRelative(-5.012f)
            horizontalLineTo(17f)
            curveToRelative(0.85f, 0f, 1.31f, -1.003f, 0.759f, -1.654f)
            lineToRelative(-6.621f, -7.803f)
            close()
        }
    }.build()
}
