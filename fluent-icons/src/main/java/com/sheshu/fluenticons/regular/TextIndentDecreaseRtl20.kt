package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextIndentDecreaseRtl20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextIndentDecreaseRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4f)
            curveTo(5.224f, 4f, 5f, 4.224f, 5f, 4.5f)
            reflectiveCurveTo(5.224f, 5f, 5.5f, 5f)
            horizontalLineToRelative(8f)
            curveTo(13.776f, 5f, 14f, 4.776f, 14f, 4.5f)
            reflectiveCurveTo(13.776f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-8f)
            close()
            moveToRelative(-3f, 5f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            reflectiveCurveTo(2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(7f, 14.5f)
            curveTo(7f, 14.224f, 7.224f, 14f, 7.5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 15f, 13.5f, 15f)
            horizontalLineToRelative(-6f)
            curveTo(7.224f, 15f, 7f, 14.776f, 7f, 14.5f)
            close()
            moveToRelative(9.453f, -6.763f)
            curveToRelative(-0.195f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.06f, 1.06f)
            lineToRelative(-1.06f, 1.06f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.513f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(1.414f, -1.414f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.707f)
            lineToRelative(-1.414f, -1.414f)
            close()
        }
    }.build()
}
