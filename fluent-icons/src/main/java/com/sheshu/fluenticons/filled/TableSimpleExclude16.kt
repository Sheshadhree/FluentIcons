package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleExclude16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleExclude16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            horizontalLineTo(6f)
            verticalLineToRelative(5f)
            horizontalLineTo(1f)
            verticalLineTo(3.5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            close()
            moveTo(1f, 9.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            close()
            moveTo(12f, 6f)
            verticalLineTo(3.5f)
            curveTo(12f, 2.12f, 10.88f, 1f, 9.5f, 1f)
            horizontalLineTo(7f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-1.75f, 2.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
