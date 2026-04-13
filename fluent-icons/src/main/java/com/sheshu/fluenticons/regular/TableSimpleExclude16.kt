package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimpleExclude16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimpleExclude16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(2.12f, 1f, 1f, 2.12f, 1f, 3.5f)
            verticalLineToRelative(6f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineToRelative(3f)
            curveTo(6.776f, 12f, 7f, 11.776f, 7f, 11.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(4.5f)
            curveTo(11.776f, 7f, 12f, 6.776f, 12f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(12f, 2.12f, 10.88f, 1f, 9.5f, 1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(6f, 7f)
            verticalLineToRelative(4f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(0f, -1f)
            horizontalLineTo(2f)
            verticalLineTo(3.5f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(2f)
            horizontalLineToRelative(2.5f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineTo(6f)
            horizontalLineTo(7f)
            close()
            moveToRelative(1.5f, 4.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
