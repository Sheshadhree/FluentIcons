package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableDefault32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableDefault32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 29f)
            horizontalLineToRelative(2.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(22f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(0f, -9f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(-2f, -8f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(2f, -2f)
            horizontalLineToRelative(7f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineTo(22f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(-2f, -7f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-8f)
            verticalLineTo(3f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(0f, 19f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(-10f, -2f)
            verticalLineToRelative(-8f)
            horizontalLineTo(3f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, -10f)
            verticalLineTo(3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 19f)
            verticalLineToRelative(-7f)
            horizontalLineTo(3f)
            verticalLineToRelative(2.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}
