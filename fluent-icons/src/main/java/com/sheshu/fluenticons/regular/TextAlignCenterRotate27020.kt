package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignCenterRotate27020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignCenterRotate27020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 16f)
            curveTo(4.224f, 16f, 4f, 15.776f, 4f, 15.5f)
            verticalLineToRelative(-11f)
            curveTo(4f, 4.224f, 4.224f, 4f, 4.5f, 4f)
            reflectiveCurveTo(5f, 4.224f, 5f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(5f, 15.776f, 4.776f, 16f, 4.5f, 16f)
            close()
            moveToRelative(5f, 2f)
            curveTo(9.224f, 18f, 9f, 17.776f, 9f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(9f, 2.224f, 9.224f, 2f, 9.5f, 2f)
            reflectiveCurveTo(10f, 2.224f, 10f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
            moveToRelative(4.5f, -4.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-7f)
            curveTo(15f, 6.224f, 14.776f, 6f, 14.5f, 6f)
            reflectiveCurveTo(14f, 6.224f, 14f, 6.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.build()
}
