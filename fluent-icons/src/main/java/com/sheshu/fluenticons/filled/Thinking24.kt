package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Thinking24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Thinking24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 18f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(5.5f, -3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(10.88f, 20f, 9.5f, 20f)
            reflectiveCurveTo(7f, 18.88f, 7f, 17.5f)
            reflectiveCurveTo(8.12f, 15f, 9.5f, 15f)
            close()
            moveTo(12f, 2f)
            curveToRelative(2.66f, 0f, 4.884f, 1.923f, 5.33f, 4.47f)
            horizontalLineToRelative(0.082f)
            curveToRelative(2.079f, 0f, 3.765f, 1.686f, 3.765f, 3.765f)
            curveToRelative(0f, 2.08f, -1.686f, 3.765f, -3.765f, 3.765f)
            horizontalLineTo(6.588f)
            curveToRelative(-2.079f, 0f, -3.764f, -1.685f, -3.764f, -3.765f)
            curveToRelative(0f, -2.079f, 1.685f, -3.764f, 3.764f, -3.764f)
            horizontalLineTo(6.67f)
            curveTo(7.116f, 3.923f, 9.34f, 2f, 12f, 2f)
            close()
        }
    }.build()
}
