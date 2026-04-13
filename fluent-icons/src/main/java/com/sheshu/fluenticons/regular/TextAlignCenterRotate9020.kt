package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignCenterRotate9020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignCenterRotate9020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 4f)
            curveTo(15.776f, 4f, 16f, 4.224f, 16f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 15.776f, 15f, 15.5f)
            verticalLineToRelative(-11f)
            curveTo(15f, 4.224f, 15.224f, 4f, 15.5f, 4f)
            close()
            moveToRelative(-5f, -2f)
            curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 17.776f, 10f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
            close()
            moveTo(6f, 6.5f)
            curveTo(6f, 6.224f, 5.776f, 6f, 5.5f, 6f)
            reflectiveCurveTo(5f, 6.224f, 5f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(5f, 13.776f, 5.224f, 14f, 5.5f, 14f)
            reflectiveCurveTo(6f, 13.776f, 6f, 13.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
