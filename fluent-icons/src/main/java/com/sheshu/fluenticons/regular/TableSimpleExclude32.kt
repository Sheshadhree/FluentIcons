package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimpleExclude32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimpleExclude32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineTo(19f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineTo(13f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(14f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6.5f)
            curveTo(23.5f, 4.015f, 21.485f, 2f, 19f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(12f, 14f)
            verticalLineToRelative(7.5f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 21.5f, 4f, 20.38f, 4f, 19f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(0f, -2f)
            horizontalLineTo(4f)
            verticalLineTo(6.5f)
            curveTo(4f, 5.12f, 5.12f, 4f, 6.5f, 4f)
            horizontalLineTo(12f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(2f, 0f)
            verticalLineTo(4f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineTo(12f)
            horizontalLineTo(14f)
            close()
            moveToRelative(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
