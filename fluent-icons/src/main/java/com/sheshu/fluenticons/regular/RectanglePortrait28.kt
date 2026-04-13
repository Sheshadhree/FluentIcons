package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectanglePortrait28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectanglePortrait28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.752f, 25.998f)
            curveToRelative(-2.07f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -2.071f, 1.68f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(12.5f)
            curveToRelative(2.072f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineToRelative(16.496f)
            curveToRelative(0f, 2.071f, -1.678f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-12.5f)
            close()
            moveToRelative(-2.25f, -3.75f)
            curveToRelative(0f, 1.243f, 1.008f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-12.5f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(16.496f)
            close()
        }
    }.build()
}
