package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackBelow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackBelow16",
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
            moveTo(5f, 10f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(8f, -4f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(11f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-3f, -1f)
            horizontalLineToRelative(3f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-1f, -3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(2f)
            close()
            moveTo(4.5f, 2f)
            horizontalLineTo(5f)
            verticalLineToRelative(3f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            close()
        }
    }.build()
}
