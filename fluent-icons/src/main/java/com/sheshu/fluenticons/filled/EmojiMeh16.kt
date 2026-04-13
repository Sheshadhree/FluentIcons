package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EmojiMeh16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiMeh16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            close()
            moveToRelative(5f, -1f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(5.5f, 7.414f, 5.5f, 7f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(7f, 6.586f, 7f, 7f)
            close()
            moveToRelative(3.5f, 0f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9f, 7.414f, 9f, 7f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(10.5f, 6.586f, 10.5f, 7f)
            close()
            moveTo(6f, 9f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.276f, 10f, 10f, 10f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(5.724f, 9f, 6f, 9f)
            close()
        }
    }.build()
}
