package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Target20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Target20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.998f, 11.5f)
            curveToRelative(0.829f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveToRelative(-5f, -1.5f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            curveToRelative(2.762f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -3.5f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(1.996f, 9.997f)
            curveToRelative(0f, -4.418f, 3.581f, -7.999f, 8f, -7.999f)
            curveToRelative(4.417f, 0f, 7.998f, 3.581f, 7.998f, 8f)
            curveToRelative(0f, 4.417f, -3.581f, 7.998f, -7.999f, 7.998f)
            curveToRelative(-4.418f, 0f, -7.999f, -3.581f, -7.999f, -7.999f)
            close()
            moveToRelative(8f, -6.499f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 3.588f, 2.91f, 6.498f, 6.5f, 6.498f)
            curveToRelative(3.588f, 0f, 6.498f, -2.91f, 6.498f, -6.499f)
            curveToRelative(0f, -3.59f, -2.91f, -6.499f, -6.499f, -6.499f)
            close()
        }
    }.build()
}
