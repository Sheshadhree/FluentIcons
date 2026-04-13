package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackBelow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackBelow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 13f, 13.5f, 13f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 13f, 2f, 13.224f, 2f, 13.5f)
            reflectiveCurveTo(2.224f, 14f, 2.5f, 14f)
            horizontalLineToRelative(11f)
            close()
            moveToRelative(-9f, -12f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(13f, 9f)
            horizontalLineToRelative(-2f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-3f, 0f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            close()
            moveTo(5f, 9f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(1f, -6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineToRelative(0.5f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(3f)
            close()
            moveTo(5f, 3f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
