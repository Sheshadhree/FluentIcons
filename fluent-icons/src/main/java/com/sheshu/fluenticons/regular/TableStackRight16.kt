package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableStackRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableStackRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(-12f, 9f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            curveTo(10f, 2.224f, 9.776f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(9f, 3f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, 5f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-6f, -1f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, -5f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, 6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(11f)
            close()
        }
    }.build()
}
