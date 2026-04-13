package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableInsertRow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableInsertRow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 13f)
            curveTo(2.224f, 13f, 2f, 13.224f, 2f, 13.5f)
            reflectiveCurveTo(2.224f, 14f, 2.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 13f, 13.5f, 13f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, -11f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            reflectiveCurveTo(2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 3f, 14f, 2.776f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(2f, 9.5f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 5f, 2f, 5.672f, 2f, 6.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(3.5f, 10f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 6.224f, 3.224f, 6f, 3.5f, 6f)
            horizontalLineTo(5f)
            verticalLineToRelative(4f)
            horizontalLineTo(3.5f)
            close()
            moveTo(6f, 10f)
            verticalLineTo(6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5f, 0f)
            verticalLineTo(6f)
            horizontalLineToRelative(1.5f)
            curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
