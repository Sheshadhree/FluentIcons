package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextIndentDecreaseLtr20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextIndentDecreaseLtr20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(8f)
            curveTo(14.776f, 4f, 15f, 4.224f, 15f, 4.5f)
            reflectiveCurveTo(14.776f, 5f, 14.5f, 5f)
            horizontalLineToRelative(-8f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
            moveTo(3.56f, 7.732f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(3.208f, 9.5f)
            lineToRelative(1.06f, 1.06f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(2.147f, 9.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineTo(3.56f, 7.731f)
            close()
            moveTo(6.5f, 9f)
            curveTo(6.224f, 9f, 6f, 9.224f, 6f, 9.5f)
            reflectiveCurveTo(6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(6f, 14.5f)
            curveTo(6f, 14.224f, 6.224f, 14f, 6.5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 15f, 12.5f, 15f)
            horizontalLineToRelative(-6f)
            curveTo(6.224f, 15f, 6f, 14.776f, 6f, 14.5f)
            close()
        }
    }.build()
}
