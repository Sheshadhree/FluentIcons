package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.65f, 3.434f)
            curveToRelative(1.91f, -1.91f, 5.005f, -1.91f, 6.915f, 0f)
            curveToRelative(1.909f, 1.91f, 1.909f, 5.005f, 0f, 6.914f)
            lineToRelative(-0.901f, 0.901f)
            lineToRelative(0.275f, 0.276f)
            curveToRelative(1.367f, 1.367f, 1.367f, 3.583f, 0f, 4.95f)
            lineToRelative(-2.232f, 2.232f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(2.232f, -2.232f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-0.276f, -0.276f)
            lineToRelative(-14.978f, 14.98f)
            curveToRelative(-0.504f, 0.504f, -1.144f, 0.852f, -1.841f, 1.002f)
            lineToRelative(-6.22f, 1.333f)
            curveToRelative(-0.332f, 0.07f, -0.677f, -0.031f, -0.917f, -0.271f)
            curveToRelative(-0.24f, -0.24f, -0.342f, -0.585f, -0.27f, -0.917f)
            lineToRelative(1.332f, -6.22f)
            curveToRelative(0.15f, -0.698f, 0.497f, -1.337f, 1.002f, -1.841f)
            lineTo(21.65f, 3.434f)
            close()
        }
    }.build()
}
