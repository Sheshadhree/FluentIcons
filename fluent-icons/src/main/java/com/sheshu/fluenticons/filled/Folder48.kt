package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Folder48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Folder48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.25f)
            curveTo(4f, 8.798f, 6.798f, 6f, 10.25f, 6f)
            horizontalLineToRelative(6.465f)
            curveToRelative(0.994f, 0f, 1.948f, 0.395f, 2.651f, 1.098f)
            lineToRelative(3.384f, 3.384f)
            lineToRelative(-5.152f, 5.152f)
            curveTo(17.364f, 15.868f, 17.046f, 16f, 16.715f, 16f)
            horizontalLineTo(4f)
            verticalLineToRelative(-3.75f)
            close()
            moveToRelative(0f, 6.25f)
            verticalLineToRelative(16.25f)
            curveTo(4f, 38.202f, 6.798f, 41f, 10.25f, 41f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-17.5f)
            curveToRelative(0f, -3.452f, -2.798f, -6.25f, -6.25f, -6.25f)
            horizontalLineTo(25.768f)
            lineToRelative(-6.402f, 6.402f)
            curveToRelative(-0.703f, 0.703f, -1.657f, 1.098f, -2.651f, 1.098f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
