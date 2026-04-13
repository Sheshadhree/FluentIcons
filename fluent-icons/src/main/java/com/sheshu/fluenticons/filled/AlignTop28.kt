package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignTop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignTop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineToRelative(22.5f)
            curveTo(25.664f, 4.5f, 26f, 4.164f, 26f, 3.75f)
            reflectiveCurveTo(25.664f, 3f, 25.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveTo(5f, 8.75f)
            curveTo(5f, 7.231f, 6.231f, 6f, 7.75f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(11.769f, 6f, 13f, 7.231f, 13f, 8.75f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(6.231f, 25f, 5f, 23.769f, 5f, 22.25f)
            verticalLineTo(8.75f)
            close()
            moveToRelative(10f, 0f)
            curveTo(15f, 7.231f, 16.231f, 6f, 17.75f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(21.769f, 6f, 23f, 7.231f, 23f, 8.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
