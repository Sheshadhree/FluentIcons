package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.687f, 1.777f)
            curveToRelative(0.57f, -1.036f, 2.059f, -1.036f, 2.629f, 0f)
            lineToRelative(5.499f, 9.999f)
            curveToRelative(0.55f, 1f, -0.174f, 2.223f, -1.314f, 2.223f)
            horizontalLineTo(2.502f)
            curveToRelative(-1.14f, 0f, -1.864f, -1.223f, -1.314f, -2.223f)
            lineToRelative(5.499f, -9.999f)
            close()
            moveTo(8.44f, 2.26f)
            curveToRelative(-0.19f, -0.345f, -0.687f, -0.345f, -0.877f, 0f)
            lineToRelative(-5.499f, 9.999f)
            curveToRelative(-0.183f, 0.333f, 0.058f, 0.74f, 0.438f, 0.74f)
            horizontalLineTo(13.5f)
            curveToRelative(0.38f, 0f, 0.622f, -0.407f, 0.439f, -0.74f)
            lineToRelative(-5.5f, -9.999f)
            close()
        }
    }.build()
}
