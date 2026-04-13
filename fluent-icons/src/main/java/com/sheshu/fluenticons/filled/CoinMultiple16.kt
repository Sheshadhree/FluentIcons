package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CoinMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CoinMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 4.5f)
            curveTo(13f, 6.433f, 10.761f, 8f, 8f, 8f)
            reflectiveCurveTo(3f, 6.433f, 3f, 4.5f)
            reflectiveCurveTo(5.239f, 1f, 8f, 1f)
            reflectiveCurveToRelative(5f, 1.567f, 5f, 3.5f)
            close()
            moveToRelative(-0.149f, 2.649f)
            curveTo(11.76f, 8.27f, 9.993f, 9f, 8f, 9f)
            curveTo(6.006f, 9f, 4.24f, 8.27f, 3.149f, 7.149f)
            curveTo(3.052f, 7.42f, 3f, 7.706f, 3f, 8f)
            curveToRelative(0f, 1.933f, 2.239f, 3.5f, 5f, 3.5f)
            reflectiveCurveToRelative(5f, -1.567f, 5f, -3.5f)
            curveToRelative(0f, -0.294f, -0.052f, -0.579f, -0.149f, -0.851f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(11.76f, 11.77f, 9.993f, 12.5f, 8f, 12.5f)
            curveToRelative(-1.994f, 0f, -3.76f, -0.73f, -4.851f, -1.851f)
            curveTo(3.052f, 10.92f, 3f, 11.206f, 3f, 11.5f)
            curveTo(3f, 13.433f, 5.239f, 15f, 8f, 15f)
            reflectiveCurveToRelative(5f, -1.567f, 5f, -3.5f)
            curveToRelative(0f, -0.294f, -0.052f, -0.579f, -0.149f, -0.851f)
            close()
        }
    }.build()
}
