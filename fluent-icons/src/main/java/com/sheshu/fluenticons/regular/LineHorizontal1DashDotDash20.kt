package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal1DashDotDash20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal1DashDotDash20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 10.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(10.69f, 8.25f, 10f, 8.25f)
            reflectiveCurveTo(8.75f, 8.81f, 8.75f, 9.5f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
            moveTo(2f, 9.5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(4f)
            curveTo(6.776f, 9f, 7f, 9.224f, 7f, 9.5f)
            reflectiveCurveTo(6.776f, 10f, 6.5f, 10f)
            horizontalLineToRelative(-4f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveToRelative(11f, 0f)
            curveTo(13f, 9.224f, 13.224f, 9f, 13.5f, 9f)
            horizontalLineToRelative(4f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveTo(17.776f, 10f, 17.5f, 10f)
            horizontalLineToRelative(-4f)
            curveTo(13.224f, 10f, 13f, 9.776f, 13f, 9.5f)
            close()
        }
    }.build()
}
