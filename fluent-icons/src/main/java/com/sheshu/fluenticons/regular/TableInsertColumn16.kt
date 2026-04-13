package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableInsertColumn16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableInsertColumn16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 2.776f, 2f, 2.5f, 2f)
            reflectiveCurveTo(2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(2f, 13.776f, 2.224f, 14f, 2.5f, 14f)
            reflectiveCurveTo(3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(11f, 0f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 13.328f, 5.672f, 14f, 6.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(6f, 3.5f)
            curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
            verticalLineTo(5f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            close()
            moveTo(6f, 6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
            verticalLineTo(11f)
            close()
        }
    }.build()
}
