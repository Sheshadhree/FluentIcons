package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(17.776f, 4f, 18f, 4.224f, 18f, 4.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-11f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
            moveToRelative(-4f, 5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveTo(17.776f, 10f, 17.5f, 10f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveTo(9.5f, 14f)
            curveTo(9.224f, 14f, 9f, 14.224f, 9f, 14.5f)
            reflectiveCurveTo(9.224f, 15f, 9.5f, 15f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 14f, 17.5f, 14f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
