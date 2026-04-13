package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutAddBelow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutAddBelow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineToRelative(11f)
            close()
            moveToRelative(-2f, -11f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}
