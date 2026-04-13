package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EmojiMeh16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiMeh16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 7f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(5.5f, 7.414f, 5.5f, 7f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(7f, 6.586f, 7f, 7f)
            close()
            moveToRelative(2.75f, 0.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9f, 6.586f, 9f, 7f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveTo(6f, 9f)
            curveTo(5.724f, 9f, 5.5f, 9.224f, 5.5f, 9.5f)
            reflectiveCurveTo(5.724f, 10f, 6f, 10f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 9f, 10f, 9f)
            horizontalLineTo(6f)
            close()
            moveToRelative(2f, -7f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0f, 1f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
