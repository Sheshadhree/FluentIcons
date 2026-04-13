package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneStatusBar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneStatusBar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(2.5f, 0f)
            curveTo(7.224f, 4f, 7f, 4.224f, 7f, 4.5f)
            reflectiveCurveTo(7.224f, 5f, 7.5f, 5f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 5f, 13f, 4.776f, 13f, 4.5f)
            reflectiveCurveTo(12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
