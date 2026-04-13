package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignJustifyLowRotate9020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignJustifyLowRotate9020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 9f)
            curveTo(15.776f, 9f, 16f, 9.224f, 16f, 9.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 17.776f, 15f, 17.5f)
            verticalLineToRelative(-8f)
            curveTo(15f, 9.224f, 15.224f, 9f, 15.5f, 9f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(10.776f, 9f, 11f, 9.224f, 11f, 9.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 17.776f, 10f, 17.5f)
            verticalLineToRelative(-8f)
            curveTo(10f, 9.224f, 10.224f, 9f, 10.5f, 9f)
            close()
            moveTo(6f, 2.5f)
            curveTo(6f, 2.224f, 5.776f, 2f, 5.5f, 2f)
            reflectiveCurveTo(5f, 2.224f, 5f, 2.5f)
            verticalLineToRelative(15f)
            curveTo(5f, 17.776f, 5.224f, 18f, 5.5f, 18f)
            reflectiveCurveTo(6f, 17.776f, 6f, 17.5f)
            verticalLineToRelative(-15f)
            close()
        }
    }.build()
}
