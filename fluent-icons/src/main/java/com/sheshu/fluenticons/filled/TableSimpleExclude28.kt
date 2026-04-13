package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleExclude28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleExclude28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(9f)
            horizontalLineTo(2f)
            verticalLineTo(5.75f)
            curveTo(2f, 3.679f, 3.679f, 2f, 5.75f, 2f)
            close()
            moveTo(2f, 12.5f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(11f)
            verticalLineToRelative(-9f)
            horizontalLineTo(2f)
            close()
            moveTo(21.5f, 11f)
            verticalLineTo(5.75f)
            curveTo(21.5f, 3.679f, 19.821f, 2f, 17.75f, 2f)
            horizontalLineTo(12.5f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(9f)
            close()
            moveTo(14f, 16.75f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(15.231f, 26f, 14f, 24.769f, 14f, 23.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
