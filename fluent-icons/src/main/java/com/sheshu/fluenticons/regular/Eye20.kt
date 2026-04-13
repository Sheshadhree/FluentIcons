package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Eye20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Eye20",
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
            moveTo(10f, 8f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveTo(8.067f, 15f, 10f, 15f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(11.933f, 8f, 10f, 8f)
            close()
            moveToRelative(-2.5f, 3.5f)
            curveTo(7.5f, 10.12f, 8.62f, 9f, 10f, 9f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(11.38f, 14f, 10f, 14f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
