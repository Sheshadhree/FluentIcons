package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookOpen32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 26.329f)
            curveTo(15.175f, 27.349f, 13.914f, 28f, 12.5f, 28f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.414f, 0f, 2.675f, 0.652f, 3.5f, 1.671f)
            curveTo(16.825f, 4.651f, 18.086f, 4f, 19.5f, 4f)
            horizontalLineTo(28f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(-1.414f, 0f, -2.675f, -0.652f, -3.5f, -1.671f)
            close()
            moveTo(17f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineTo(28f)
            verticalLineTo(6f)
            horizontalLineToRelative(-8.5f)
            curveTo(18.12f, 6f, 17f, 7.12f, 17f, 8.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(15f, 7.12f, 13.88f, 6f, 12.5f, 6f)
            horizontalLineTo(4f)
            verticalLineToRelative(20f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-15f)
            close()
        }
    }.build()
}
