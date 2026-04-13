package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Eye20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Eye20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.26f, 11.602f)
            curveTo(3.942f, 8.327f, 6.793f, 6f, 10f, 6f)
            curveToRelative(3.206f, 0f, 6.057f, 2.327f, 6.74f, 5.602f)
            curveToRelative(0.057f, 0.27f, 0.322f, 0.444f, 0.593f, 0.387f)
            curveToRelative(0.27f, -0.056f, 0.443f, -0.32f, 0.387f, -0.591f)
            curveTo(16.943f, 7.673f, 13.693f, 5f, 10f, 5f)
            curveToRelative(-3.693f, 0f, -6.943f, 2.673f, -7.72f, 6.398f)
            curveToRelative(-0.056f, 0.27f, 0.117f, 0.535f, 0.388f, 0.591f)
            curveToRelative(0.27f, 0.057f, 0.535f, -0.117f, 0.591f, -0.387f)
            close()
            moveTo(9.99f, 8f)
            curveToRelative(1.932f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(11.921f, 15f, 9.99f, 15f)
            curveToRelative(-1.934f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(8.056f, 8f, 9.99f, 8f)
            close()
        }
    }.build()
}
