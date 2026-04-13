package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimple48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimple48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 10.75f)
            curveTo(6f, 8.127f, 8.127f, 6f, 10.75f, 6f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(16.75f)
            horizontalLineTo(6f)
            verticalLineToRelative(-12f)
            close()
            moveToRelative(0f, 14.5f)
            verticalLineToRelative(12f)
            curveTo(6f, 39.873f, 8.127f, 42f, 10.75f, 42f)
            horizontalLineToRelative(12f)
            verticalLineTo(25.25f)
            horizontalLineTo(6f)
            close()
            moveTo(25.25f, 42f)
            horizontalLineToRelative(12f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineToRelative(-12f)
            horizontalLineTo(25.25f)
            verticalLineTo(42f)
            close()
            moveTo(42f, 22.75f)
            verticalLineToRelative(-12f)
            curveTo(42f, 8.127f, 39.873f, 6f, 37.25f, 6f)
            horizontalLineToRelative(-12f)
            verticalLineToRelative(16.75f)
            horizontalLineTo(42f)
            close()
        }
    }.build()
}
