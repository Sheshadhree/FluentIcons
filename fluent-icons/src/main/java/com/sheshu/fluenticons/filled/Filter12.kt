package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filter12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 2.75f)
            curveTo(1f, 2.336f, 1.336f, 2f, 1.75f, 2f)
            horizontalLineToRelative(8.5f)
            curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
            reflectiveCurveTo(10.664f, 3.5f, 10.25f, 3.5f)
            horizontalLineToRelative(-8.5f)
            curveTo(1.336f, 3.5f, 1f, 3.164f, 1f, 2.75f)
            close()
            moveToRelative(2f, 3f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            horizontalLineToRelative(4.5f)
            curveTo(8.664f, 5f, 9f, 5.336f, 9f, 5.75f)
            reflectiveCurveTo(8.664f, 6.5f, 8.25f, 6.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(3.336f, 6.5f, 3f, 6.164f, 3f, 5.75f)
            close()
            moveTo(5.25f, 8f)
            curveTo(4.836f, 8f, 4.5f, 8.336f, 4.5f, 8.75f)
            reflectiveCurveTo(4.836f, 9.5f, 5.25f, 9.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.164f, 8f, 6.75f, 8f)
            horizontalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
