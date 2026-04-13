package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EmojiLaugh16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiLaugh16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveTo(6f, 6f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(6.724f, 7f, 7f, 7f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            curveTo(7.5f, 5.672f, 6.828f, 5f, 6f, 5f)
            reflectiveCurveTo(4.5f, 5.672f, 4.5f, 6.5f)
            curveTo(4.5f, 6.776f, 4.724f, 7f, 5f, 7f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(5.724f, 6f, 6f, 6f)
            close()
            moveToRelative(4f, 0f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.724f, 7f, 11f, 7f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            curveTo(11.5f, 5.672f, 10.828f, 5f, 10f, 5f)
            reflectiveCurveTo(8.5f, 5.672f, 8.5f, 6.5f)
            curveTo(8.5f, 6.776f, 8.724f, 7f, 9f, 7f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.724f, 6f, 10f, 6f)
            close()
            moveTo(4.535f, 8.5f)
            curveToRelative(0.243f, 1.696f, 1.702f, 3f, 3.465f, 3f)
            reflectiveCurveToRelative(3.222f, -1.304f, 3.464f, -3f)
            horizontalLineTo(4.535f)
            close()
        }
    }.build()
}
