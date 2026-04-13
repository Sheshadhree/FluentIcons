package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.408f, 3.498f)
            curveToRelative(-0.823f, -0.66f, -1.993f, -0.66f, -2.816f, 0f)
            lineToRelative(-7.75f, 6.217f)
            curveTo(4.31f, 10.142f, 4f, 10.787f, 4f, 11.47f)
            verticalLineToRelative(11.28f)
            curveTo(4f, 23.993f, 5.007f, 25f, 6.25f, 25f)
            horizontalLineToRelative(2.5f)
            curveTo(9.993f, 25f, 11f, 23.993f, 11f, 22.75f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(11.47f)
            curveToRelative(0f, -0.683f, -0.31f, -1.328f, -0.842f, -1.755f)
            lineToRelative(-7.75f, -6.217f)
            close()
        }
    }.build()
}
