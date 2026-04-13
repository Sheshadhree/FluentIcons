package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserTool24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserTool24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2.75f)
            curveTo(4.5f, 2.336f, 4.164f, 2f, 3.75f, 2f)
            reflectiveCurveTo(3f, 2.336f, 3f, 2.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 19.873f, 5.127f, 22f, 7.75f, 22f)
            horizontalLineToRelative(8.5f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineTo(2.75f)
            curveTo(21f, 2.336f, 20.664f, 2f, 20.25f, 2f)
            reflectiveCurveTo(19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(-15f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(0f, 5.75f)
            horizontalLineToRelative(15f)
            verticalLineTo(12f)
            horizontalLineToRelative(-15f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}
