package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Laptop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Laptop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 5f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 13.328f, 3.672f, 14f, 4.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(-2f, 10f)
            curveTo(2.224f, 15f, 2f, 15.224f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 16f, 2.5f, 16f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}
