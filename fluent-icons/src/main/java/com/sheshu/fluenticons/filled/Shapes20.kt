package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shapes20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.5f)
            curveTo(2f, 4.462f, 4.462f, 2f, 7.5f, 2f)
            curveToRelative(2.869f, 0f, 5.225f, 2.197f, 5.478f, 5f)
            horizontalLineTo(10.5f)
            curveTo(8.567f, 7f, 7f, 8.567f, 7f, 10.5f)
            verticalLineToRelative(2.478f)
            curveTo(4.197f, 12.725f, 2f, 10.369f, 2f, 7.5f)
            close()
            moveTo(10.5f, 8f)
            curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(18f, 9.12f, 16.88f, 8f, 15.5f, 8f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
