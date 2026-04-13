package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal1Dashes16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal1Dashes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            horizontalLineToRelative(1.5f)
            curveTo(4.664f, 7f, 5f, 7.336f, 5f, 7.75f)
            reflectiveCurveTo(4.664f, 8.5f, 4.25f, 8.5f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(6.5f, 7.336f, 6.836f, 7f, 7.25f, 7f)
            horizontalLineToRelative(1.5f)
            curveTo(9.164f, 7f, 9.5f, 7.336f, 9.5f, 7.75f)
            reflectiveCurveTo(9.164f, 8.5f, 8.75f, 8.5f)
            horizontalLineToRelative(-1.5f)
            curveTo(6.836f, 8.5f, 6.5f, 8.164f, 6.5f, 7.75f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(11f, 7.336f, 11.336f, 7f, 11.75f, 7f)
            horizontalLineToRelative(1.5f)
            curveTo(13.664f, 7f, 14f, 7.336f, 14f, 7.75f)
            reflectiveCurveTo(13.664f, 8.5f, 13.25f, 8.5f)
            horizontalLineToRelative(-1.5f)
            curveTo(11.336f, 8.5f, 11f, 8.164f, 11f, 7.75f)
            close()
        }
    }.build()
}
