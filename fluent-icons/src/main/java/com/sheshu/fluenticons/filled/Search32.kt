package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.7f, 22.467f)
            curveTo(18.73f, 24.052f, 16.227f, 25f, 13.5f, 25f)
            curveTo(7.149f, 25f, 2f, 19.851f, 2f, 13.5f)
            reflectiveCurveTo(7.149f, 2f, 13.5f, 2f)
            reflectiveCurveTo(25f, 7.149f, 25f, 13.5f)
            curveToRelative(0f, 2.725f, -0.948f, 5.229f, -2.532f, 7.2f)
            lineToRelative(6.167f, 6.166f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-6.166f, -6.167f)
            close()
            moveToRelative(1.8f, -8.967f)
            curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
            reflectiveCurveToRelative(-9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            close()
        }
    }.build()
}
