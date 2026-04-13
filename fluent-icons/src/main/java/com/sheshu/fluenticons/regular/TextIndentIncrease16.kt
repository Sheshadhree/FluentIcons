package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextIndentIncrease16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextIndentIncrease16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 3f)
            curveTo(11.776f, 3f, 12f, 3.224f, 12f, 3.5f)
            reflectiveCurveTo(11.776f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-6f)
            curveTo(5.224f, 4f, 5f, 3.776f, 5f, 3.5f)
            reflectiveCurveTo(5.224f, 3f, 5.5f, 3f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(3f, 4f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
            reflectiveCurveTo(5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(-5f, 4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.776f, 12f, 9.5f, 12f)
            horizontalLineToRelative(-4f)
            curveTo(5.224f, 12f, 5f, 11.776f, 5f, 11.5f)
            reflectiveCurveTo(5.224f, 11f, 5.5f, 11f)
            horizontalLineToRelative(4f)
            close()
            moveTo(1.854f, 5.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(2.293f, 7.5f)
            lineTo(1.146f, 8.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}
