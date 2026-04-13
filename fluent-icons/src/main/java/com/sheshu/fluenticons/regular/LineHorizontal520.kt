package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal520: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal520",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            reflectiveCurveTo(17.776f, 4f, 17.5f, 4f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            close()
            moveToRelative(0f, 6f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveTo(17.776f, 10f, 17.5f, 10f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveTo(2.5f, 6f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            reflectiveCurveTo(2.224f, 7f, 2.5f, 7f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 7f, 18f, 6.776f, 18f, 6.5f)
            reflectiveCurveTo(17.776f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(2f, 12.5f)
            curveTo(2f, 12.224f, 2.224f, 12f, 2.5f, 12f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 13f, 17.5f, 13f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
            close()
            moveTo(2.5f, 15f)
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
