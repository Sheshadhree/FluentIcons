package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EraserTool24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserTool24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(4.164f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(15f)
            verticalLineTo(2.75f)
            curveTo(19.5f, 2.336f, 19.836f, 2f, 20.25f, 2f)
            reflectiveCurveTo(21f, 2.336f, 21f, 2.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.127f, 22f, 3f, 19.873f, 3f, 17.25f)
            verticalLineTo(2.75f)
            curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
            close()
            moveTo(19.5f, 8.5f)
            horizontalLineToRelative(-15f)
            verticalLineTo(12f)
            horizontalLineToRelative(15f)
            verticalLineTo(8.5f)
            close()
            moveToRelative(-15f, 8.75f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(13.5f)
            horizontalLineToRelative(-15f)
            verticalLineToRelative(3.75f)
            close()
        }
    }.build()
}
