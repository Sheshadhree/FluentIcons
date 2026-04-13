package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagCheckered20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagCheckered20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3.5f)
            curveTo(5f, 3.224f, 5.224f, 3f, 5.5f, 3f)
            horizontalLineToRelative(10f)
            curveTo(15.776f, 3f, 16f, 3.224f, 16f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.5f)
            curveTo(6f, 17.776f, 5.776f, 18f, 5.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineToRelative(-14f)
            close()
            moveTo(6f, 13f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineTo(9f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
