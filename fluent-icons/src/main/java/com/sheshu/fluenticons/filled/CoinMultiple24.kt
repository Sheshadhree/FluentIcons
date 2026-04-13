package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CoinMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CoinMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 7f)
            curveToRelative(0f, 2.761f, -3.134f, 5f, -7f, 5f)
            reflectiveCurveTo(5f, 9.761f, 5f, 7f)
            reflectiveCurveToRelative(3.134f, -5f, 7f, -5f)
            reflectiveCurveToRelative(7f, 2.239f, 7f, 5f)
            close()
            moveToRelative(-0.38f, 3.37f)
            curveTo(17.18f, 11.958f, 14.752f, 13f, 12f, 13f)
            curveToRelative(-2.752f, 0f, -5.18f, -1.043f, -6.62f, -2.63f)
            curveTo(5.134f, 10.881f, 5f, 11.43f, 5f, 12f)
            curveToRelative(0f, 2.761f, 3.134f, 5f, 7f, 5f)
            reflectiveCurveToRelative(7f, -2.239f, 7f, -5f)
            curveToRelative(0f, -0.57f, -0.134f, -1.119f, -0.38f, -1.63f)
            close()
            moveToRelative(0f, 5f)
            curveTo(17.18f, 16.958f, 14.752f, 18f, 12f, 18f)
            curveToRelative(-2.752f, 0f, -5.18f, -1.043f, -6.62f, -2.63f)
            curveTo(5.134f, 15.881f, 5f, 16.43f, 5f, 17f)
            curveToRelative(0f, 2.761f, 3.134f, 5f, 7f, 5f)
            reflectiveCurveToRelative(7f, -2.239f, 7f, -5f)
            curveToRelative(0f, -0.57f, -0.134f, -1.119f, -0.38f, -1.63f)
            close()
        }
    }.build()
}
