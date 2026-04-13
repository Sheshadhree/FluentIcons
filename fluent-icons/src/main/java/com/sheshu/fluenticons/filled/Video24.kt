package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Video24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.545f, 5f, 15f, 6.455f, 15f, 8.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            verticalLineToRelative(-7.5f)
            close()
            moveToRelative(17.257f, 9.438f)
            lineTo(16f, 15.44f)
            verticalLineTo(8.562f)
            lineToRelative(3.257f, -2.249f)
            curveToRelative(1.161f, -0.802f, 2.745f, 0.03f, 2.745f, 1.44f)
            verticalLineToRelative(8.495f)
            curveToRelative(0f, 1.41f, -1.584f, 2.242f, -2.745f, 1.44f)
            close()
        }
    }.build()
}
