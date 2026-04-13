package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Archive24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Archive24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(15f)
            curveTo(20.328f, 3f, 21f, 3.672f, 21f, 4.5f)
            verticalLineTo(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-15f)
            curveTo(3.672f, 7.5f, 3f, 6.828f, 3f, 6f)
            verticalLineTo(4.5f)
            close()
            moveTo(4f, 9f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(9f)
            close()
            moveToRelative(6.25f, 2f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.164f, 11f, 13.75f, 11f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
