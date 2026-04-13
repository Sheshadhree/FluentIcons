package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Edit32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Edit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.564f, 3.434f)
            curveToRelative(-1.909f, -1.91f, -5.005f, -1.91f, -6.914f, 0f)
            lineTo(4.357f, 20.73f)
            curveToRelative(-0.505f, 0.504f, -0.852f, 1.143f, -1.002f, 1.84f)
            lineToRelative(-1.333f, 6.22f)
            curveToRelative(-0.07f, 0.332f, 0.031f, 0.677f, 0.27f, 0.917f)
            curveToRelative(0.24f, 0.24f, 0.586f, 0.342f, 0.917f, 0.27f)
            lineToRelative(6.22f, -1.332f)
            curveToRelative(0.698f, -0.15f, 1.338f, -0.498f, 1.842f, -1.002f)
            lineToRelative(17.294f, -17.295f)
            curveToRelative(1.909f, -1.91f, 1.909f, -5.005f, 0f, -6.914f)
            close()
            moveToRelative(-5.5f, 1.414f)
            curveToRelative(1.129f, -1.128f, 2.958f, -1.128f, 4.086f, 0f)
            curveToRelative(1.129f, 1.128f, 1.129f, 2.958f, 0f, 4.086f)
            lineToRelative(-0.9f, 0.901f)
            lineToRelative(-4.086f, -4.086f)
            lineToRelative(0.9f, -0.9f)
            close()
            moveTo(20.75f, 7.163f)
            lineToRelative(4.086f, 4.086f)
            lineTo(9.857f, 26.23f)
            curveToRelative(-0.232f, 0.23f, -0.527f, 0.39f, -0.847f, 0.459f)
            lineTo(4.3f, 27.7f)
            lineToRelative(1.01f, -4.71f)
            curveToRelative(0.068f, -0.32f, 0.228f, -0.614f, 0.46f, -0.846f)
            lineToRelative(14.978f, -14.98f)
            close()
        }
    }.build()
}
